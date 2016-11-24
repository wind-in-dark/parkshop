package parkshop.pmcourse.service;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import parkshop.pmcourse.domain.Info;
import parkshop.pmcourse.mapping.InfoMapper;
import parkshop.pmcourse.service.inter.InfoSer;

/**
 * Created by Administrator on 2016/9/8.
 */
@Service
public class InfoSerImpl implements InfoSer {
    private static final int MODIFYPASSSUC=0;//修改密码成功
    private static final int PASSERROE=1;//密码错误
    private static final int SySTEMERROE=2;//系统错误
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoSerImpl.class);
    @Autowired
    private InfoMapper infoMapper;

    

    @Override
    public Info login(Info user) {
        try {
            user= infoMapper.selectByPw(user.getUsername(),user.getPassword());
        } catch (Exception e) {
           LOGGER.error(e.getMessage());
           return null;
        }
		return user;
        
    }
    
    @Override
	public boolean signup(Info user) {
		// TODO Auto-generated method stub
		 
	        try {
	        	Info temp=infoMapper.selectByName(user.getUsername());
	        	if(temp!=null&&temp.getUsername()!=null)
	        		return false;
	        	
	             infoMapper.insert(user.getUsername(), user.getPassword());
	             return true;
	        } catch (Exception e) {
	           LOGGER.error(e.getMessage());
	        }
	      return false;
	}
	
    
    @Override
    public boolean checkPass(Integer id,String oldPass){
        int num=0;
        try {
            num=infoMapper.selectByOldPass(oldPass,id);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return num>0;
    }
    @Override
   /* @CacheEvict(value = "profileOfInfo",key = "1")*/
    public boolean updateInfo(Info info) {
        boolean result=true;
        try {
            infoMapper.update(info);
        } catch (Exception e) {
           LOGGER.error(e.getMessage());
            result=false;
        }
        return result;
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public int modifyPw(String oldPass,String newPass,Integer id) {
        int result;
       if (checkPass(id,oldPass)){
           try {
               infoMapper.updataPass(id, newPass);
               result=MODIFYPASSSUC;
           } catch (Exception e) {
               LOGGER.error(e.getMessage());
               result=SySTEMERROE;
           }
       }else {
           result=PASSERROE;
       }
        return result;
    }

    @Override
    public String getResumeMd(Integer id){
       String md="";
        try {
            md=infoMapper.selectMd(id);
        } catch (Exception e) {
           LOGGER.error(e.getMessage());
        }
        return md;
    }
    @Override
   /* @CacheEvict(value = "resumeView",key = "1")*/
    public boolean updateResume(Info info){
        boolean result=true;
        try {
            infoMapper.updateResume(info);
        } catch (Exception e) {
            result=false;
           LOGGER.error(e.getMessage());
        }
        return result;
    }

   
   /* @Cacheable(value = "resumeView",key = "1")
    * 当多用户时，不需要固定缓存。
    * 否则会导致其他用户请求数据时，直接从缓存中读取，
    * 不会从数据库中获取，导致其他用户看到第一个人的数据
    * 
    * */
    @Override
    public String getResumeView(Integer id) {
        String resume="";
        try {
        	
            resume=infoMapper.selectResume(id);
           } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return resume;
    }
    @Override
   /* @CacheEvict(value = "profileOfInfo",key = "1")*/
    public void updateAvatar(Integer id,String avatar) {
        try {
            infoMapper.updateAvater(id, avatar);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

	
	public Info getUserInfoByName(String userName) {
		// TODO Auto-generated method stub
		Info user=null;
		try{
			user=infoMapper.selectByName(userName);
			user.setPassword(null);
		}catch(Exception e){
			LOGGER.error(e.getMessage());
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public void addSession(HttpServletRequest request, Info info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroySession(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}
}
