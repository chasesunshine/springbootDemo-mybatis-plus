package com.jt.demo.convert;

import com.jt.demo.pojo.User;
import com.jt.demo.pojo.common.UserVo;
import com.jt.demo.pojo.common.UserVo1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserConver {

    UserVo1 convert(User user);

    @Mappings({
            @Mapping(source = "name",target = "name1"),
            @Mapping(source = "age",target = "age1"),
            @Mapping(source = "sex",target = "sex1")
    })
    UserVo item2Dto(User user);

}

