package parkshop.pmcourse.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import parkshop.pmcourse.domain.Info;

/**
 * mybatis的mapper
 * 映射所有个人信息操作的sql语句
 */
@Repository
@Mapper
public interface InfoMapper {

    @Select({
        "select id,username,email,",
            "github,twitter,avatar",
            "from admin ",
            "where id=#{ID}"
    })
    Info select(@Param("ID") Integer id) throws Exception;

    @Select({
        "select id,username,email,password,",
        "github,twitter,avatar",
            "from admin ",
            "where username = #{un} ",
            "and password = #{pw}"
    })
    Info selectByPw(@Param("un") String username, @Param("pw") String password) throws Exception;
    @Select({
    	"select id,username,email, ",
    	"github,twitter,avatar",
    	"from admin ",
    	"where username = #{un} "
    })
    Info selectByName(@Param("un") String username) throws Exception;

    @Select({
            "select count(*) ",
            "from admin ",
            "where id=#{ID} and password = #{pw}"
    })
    int selectByOldPass(@Param("pw") String oldPass,@Param("ID") Integer id) throws Exception;

    @Select("select md from admin where id=#{ID}")
    String selectMd(@Param("ID") Integer id) throws Exception;

    // resume 用来保存所有格式的简历，用于日后格式的扩展，目前resume的值和md 字段一样
    @Select("select resume from admin where id=#{ID}")
    String selectResume(@Param("ID") Integer id) throws Exception;

    @Update({
        "update admin set username = #{if.username},",
                "email= #{if.email},github=#{if.github},",
                "twitter=#{if.twitter} ",
                "where id=#{if.id}"
    })
    void update(@Param("if") Info info);


    @Update({
        "update admin set",
            "password = #{np} ",
            "where id=#{ID}"
    })
    int updataPass(@Param("ID") Integer id,@Param("np") String newPass) throws Exception;

    @Update({
            "update admin ",
            "set md = #{if.md},",
            "resume = #{if.resume} ",
            "where id=#{if.id}"
    })
    void updateResume(@Param("if") Info info) throws Exception;

    @Update({
            "update admin",
            "set avatar = #{ava}",
            "where id=#{ID}"
    })
    void updateAvater(@Param("ID") Integer id,@Param("ava") String avatar) throws Exception;
    
// 只要有用户名和密码即可注册
@Insert("insert ignore into admin (username,password) values(#{uN},#{pW})")
int insert(@Param("uN") String userName, @Param("pW") String passWord) throws Exception;

}
