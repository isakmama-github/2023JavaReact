package exam17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Movie {

	public static void main(String[] args) {
		String key = "ace8657116bb0d8f13abaf43c62fc699";
		
		String result = "";
		
		try {
			URL url = new URL
				("http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=" 
			             + key + "&movieCd=20124039");
			BufferedReader bf;
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			result = bf.readLine();
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
			JSONObject movieInfoResult = (JSONObject)jsonObject.get("movieInfoResult");
			JSONObject movieInfo = (JSONObject)movieInfoResult.get("movieInfo");
			
			JSONArray nations = (JSONArray)movieInfo.get("nations");
			JSONObject nations_nationNm = (JSONObject)nations.get(0);
			JSONArray directors = (JSONArray)movieInfo.get("directors");
			JSONObject directors_peopleNm = (JSONObject)directors.get(0);
			JSONArray genres = (JSONArray)movieInfo.get("genres");
			JSONObject genres_genreNm = (JSONObject)genres.get(0);
			
			JSONArray actors = (JSONArray)movieInfo.get("actors");
			
			
//			HashMap<String, String> hash = (HashMap<String, String>) actors.stream();
//			actors.stream()
//			.map(actor ->  ((JSONObject)actor).get("peopleNm"))
//			      .forEach(System.out::print);
			
			String peopleNm = "";
			for (int i=0; i<actors.size(); i++) {
				JSONObject actors_peopleNm = (JSONObject)actors.get(i);
				peopleNm += actors_peopleNm.get("peopleNm") + " ";
			}
			
			System.out.println("영화코드: " + movieInfo.get("movieCd"));
			System.out.println("영화명(한글): " + movieInfo.get("movieNm"));
			System.out.println("영화명(영문): " + movieInfo.get("movieNmEn"));
			System.out.println("재생시간: " + movieInfo.get("showTm"));
			System.out.println("개봉일: " + movieInfo.get("openDt"));
			System.out.println("제작국명: " + nations_nationNm.get("nationNm"));
			System.out.println("감독: " +directors_peopleNm.get("peopleNm"));
			System.out.println("장르: " +genres_genreNm.get("genreNm"));
			System.out.println("출연배우: " +peopleNm);
			
						
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
