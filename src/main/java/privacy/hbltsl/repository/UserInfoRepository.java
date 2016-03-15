package privacy.hbltsl.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import privacy.hbltsl.model.UserInfo;

@Repository
public class UserInfoRepository {

	// inject the actual template
	@Autowired
	private MongoTemplate template; // inject the template as ListOperations

	public void save(UserInfo ui) {
		template.save(ui);
	}

}
