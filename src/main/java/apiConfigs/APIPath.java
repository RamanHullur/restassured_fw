package apiConfigs;

public class APIPath {
	
	public static final class apiPath{
		
		//GET
		public static final String GET_LIST_OF_USERS = "/api/users?page=2";
		public static final String GET_SINGLE_USERS = "/api/users/2";
		
		//POST
		public static final String CREATE_USER = "/api/users";
		
		//DELETE
		public static final String DELETE_USER = "/api/users/2";
		
		
		
		//GET
		public static final String GET_LIST_OF_POSTS ="posts";
		public static final String GET_SINGLE_POST="posts/";
		
		//POST
		public static final String CREATE_POST="posts";
		
		//UPDATE
		public static final String UPDATE_POST="posts";
	}

}
