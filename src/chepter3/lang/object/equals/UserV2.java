package chepter3.lang.object.equals;

import java.util.Objects;

public class UserV2 {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserV2(String id) {
		this.id = id;
	}

	// @Override
	// public boolean equals(Object obj) {
	// 	// obj에는 id 필드가 없기에 다운 캐스팅 필요
	// 	UserV2 user = (UserV2) obj;
	// 	return this.id.equals(user.id);
	// }

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		UserV2 userV2 = (UserV2)o;
		return Objects.equals(id, userV2.id);
	}

}
