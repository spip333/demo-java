package org.nstern.demos;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Book;
import org.nstern.demos.dto.BookType;
import org.nstern.demos.util.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroupingByDemo {

    private static final Logger log = LoggerFactory.getLogger(GroupingByDemo.class);

    public static void main(String[] args) {

        GroupingByDemo demo = new GroupingByDemo();
        demo.test();
    }

    private void test() {
        List<Book> list = DataUtil.createSampleBookList();

        Map<BookType, List<Book>> map1 = list.stream().collect(groupingBy(Book::getBookType, toList()));

        if (log.isInfoEnabled()) {
            log.info(map1.toString());
        }

        Map<BookType, List<String>> map2 =
                list.stream().collect(groupingBy(Book::getBookType, mapping(Book::getTitle, Collectors.toList())));

        if (log.isInfoEnabled()) {
            log.info(map2.toString());
        }

    }
}
