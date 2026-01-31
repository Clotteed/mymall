package com.clotte.mymall.search.controller;


import com.clotte.mymall.search.entity.Document;
import com.clotte.mymall.search.esmapper.DocumentMapper;
import org.dromara.easyes.core.conditions.select.LambdaEsQueryWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/es")
public class TestController {

    @Resource
    DocumentMapper documentMapper;

    @GetMapping("/createIndex")
    public Boolean createIndex() {
        // 初始化-> 创建索引
        return documentMapper.createIndex();
    }

//    @GetMapping("/insert")
//    public Integer insert() {
//        // 初始化-> 新增数据
//        Document document = new Document();
//        document.setId("1234567abcdefg");
//        document.setTitle("老汉");
//        document.setContent("推*技术过硬");
//        return documentMapper.insert(document);
//    }

    @GetMapping("/search")
    public List<Document> search() {
        // 查询出所有标题为老汉的文档列表
        LambdaEsQueryWrapper<Document> wrapper = new LambdaEsQueryWrapper<>();
        wrapper.eq(Document::getTitle, "老汉")
                .and(i->i.eq(Document::getId,1).eq(Document::getContent,"推车"))
                .or()
                .and(i->i.eq(Document::getId,2).eq(Document::getContent,"推土"));
        String source = documentMapper.getSource(wrapper);
        System.out.println(source);
        return documentMapper.selectList(wrapper);
    }
}
