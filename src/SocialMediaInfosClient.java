import java.util.List;

import org.soa.ws.test.SocialMedia;
import org.soa.ws.test.SocialMediaInfos;
import org.soa.ws.test.SocialMediaInfosImplService;


public class SocialMediaInfosClient {

	public static void main(String[] args) {
		
		SocialMediaInfosImplService service = new SocialMediaInfosImplService();
		SocialMediaInfos socialmedia = service.getSocialMediaInfosImplPort();
		List<SocialMedia> socialmediaList = socialmedia.getAllSocialMediaInfos();
		for(int i=0; i<socialmediaList.size(); i++)
			System.out.println("Social Media : \n\tName: "+socialmediaList.get(i).getName());

	}

}
