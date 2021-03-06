package com.jt.demo.convert;

import com.jt.demo.pojo.User;
import com.jt.demo.pojo.common.UserVo;
import com.jt.demo.pojo.common.UserVo1;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-10T15:05:38+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@Component
public class UserConverImpl implements UserConver {

    @Override
    public UserVo1 convert(User user) {
        if ( user == null ) {
            return null;
        }

        UserVo1 userVo1 = new UserVo1();

        userVo1.setName( user.getName() );
        userVo1.setAge( user.getAge() );
        userVo1.setSex( user.getSex() );

        return userVo1;
    }

    @Override
    public UserVo item2Dto(User user) {
        if ( user == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        userVo.setName1( user.getName() );
        userVo.setSex1( user.getSex() );
        userVo.setAge1( user.getAge() );

        return userVo;
    }
}
