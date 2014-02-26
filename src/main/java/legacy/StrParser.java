package legacy;

/**
 * 文字列を解析するクラス.
 * */
public class StrParser {
	
	/**
	 * 文字列を演算子のところで分割する
	 * @param s 解析対象文字列
	 * */
	public String[] parse(String s){
		
		//1. 解析対象文字列を区切り文字”<= ”を用いてトークンに分割する
		String[] st = s.split("<=");
		
		//2. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"<=",st[1]};
			return tokens;
		}
		
		//3. 解析対象文字列を区切り文字”>=”を用いてトークンに分割する
		st = s.split(">=");
		
		//4. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],">=",st[1]};
			return tokens;
		}
		
		//5. 解析対象文字列を区切り文字”<”を用いてトークンに分割する
		st = s.split("<");
		
		//6. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"<",st[1]};
			return tokens;
		}
		
		//7. 解析対象文字列を区切り文字”>”を用いてトークンに分割する
		st = s.split(">");
		
		//8. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],">",st[1]};
			return tokens;
		}
		
		//9. 解析対象文字列を区切り文字”==”を用いてトークンに分割する
		st = s.split("==");
		
		//10. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"==",st[1]};
			return tokens;
		}
		
		//11. 解析対象文字列を区切り文字”+=”を用いてトークンに分割する
		st = s.split("\\+=");
		
		//12. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"+=",st[1]};
			return tokens;
		}
		
		//13. 解析対象文字列を区切り文字"-="を用いてトークンに分割する
		st = s.split("\\-=");
		
		//14. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"-=",st[1]};
			return tokens;
		}
		
		//15. 解析対象文字列を区切り文字"!="を用いてトークンに分割する
		st = s.split("!=");
		
		//16. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"!=",st[1]};
			return tokens;
		}
		
		//17. 解析対象文字列を区切り文字”=”を用いてトークンに分割する
		st = s.split("=");
		
		//18. トークンが二つ以上存在するならば、そのトークン群を返す
		if(st.length >= 2){
			String[] tokens = {st[0],"=",st[1]};
			return tokens;
		}
		
		//19. null を返す
		return null;
	}
}
