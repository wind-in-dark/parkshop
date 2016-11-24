package parkshop.pmcourse.service.inter;

import javax.servlet.http.HttpServletRequest;

import parkshop.pmcourse.domain.Info;

/**
 * 个人信息的service接口
 */
public interface InfoSer {
   /* 转移到 SessionTools类中
    * Info getInfo(HttpServletRequest request);//根据当前session,获取username,email,github,twitter,avatar信息
   */
    Info login(Info info);//登录验证
    boolean signup(Info info);//注册
    int modifyPw(String oldPass, String newPass,Integer id);//修改密码
    boolean updateInfo(Info info);//后台管理中更新sername,email,github,twitter,avatar信息
    boolean checkPass(Integer id,String oldPass);//修改密码之前进行的密码验证
    void addSession(HttpServletRequest request, Info info);//登录成功后添加session
    void destroySession(HttpServletRequest request);//退出登录或者超时之后销毁session
    String getResumeMd(Integer id);//后台管理中获取简历的markdown文本
    boolean updateResume(Info info);//后台管理更新简历
    String getResumeView(Integer id);//前端about页面获取简历的html文本
    void updateAvatar(Integer id,String avatar);//更新头像
    public Info getUserInfoByName(String userName);// 根据用户名称获取用户信息，不含密码，用于游客访问
}
