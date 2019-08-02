public class CreateGist { 



public static void main(String[] args) {
// TODO Auto-generated method stub

// HTTP GET request
private void sendGet() throws Exception {

String url = "https://developer.github.com/v3/gists/#create-a-gist";

URL obj = new URL(url);
HttpURLConnection con = (HttpURLConnection) obj.openConnection();

// optional default is GET
con.setRequestMethod("GET");

//add request header
con.setRequestProperty("User-Agent", USER_AGENT);

int responseCode = con.getResponseCode();
System.out.println("\nSending 'GET' request to URL : " + url);
System.out.println("Response Code : " + responseCode);

BufferedReader in = new BufferedReader(
new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();

while ((inputLine = in.readLine()) != null) {
response.append(inputLine);
}
in.close();

//print result
System.out.println(response.toString());

}



}
}