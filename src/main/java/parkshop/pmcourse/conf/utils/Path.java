package parkshop.pmcourse.conf.utils;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="path")
public class Path {

	private String uploadFilePath;

	
    public String getUploadFilePath() {
		return uploadFilePath;
	}


	public void setUploadFilePath(String uploadFilePath) {
		this.uploadFilePath = uploadFilePath;
	}

}
