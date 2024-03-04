package Hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;


public class TestApi {
    public int testCallApi3(String competition, int year) throws Exception {
        String nameWinner = "";
        competition = competition.replaceAll(" ", "%20");
        Gson gson = new Gson();
        String page = "1";
        String param1 = "name=";
        String param2="year=";
        param2=param2.concat(String.valueOf(year));
        param1 = param1.concat(competition);
        String baseUrl1 = "https://jsonmock.hackerrank.com/api/football_competitions?"+param1+"&"+param2+"&page=";
        URL urlUrl = buildUrl(baseUrl1, page);
        HttpURLConnection con = buildConnection(urlUrl);
        int totalGoals = 0;
        Response2 response2= new Response2();
        response2 = gson.fromJson(getResponse(con), Response2.class);
        nameWinner = response2.getData().get(0).getWinner();
        String params3 = "team1=";
        params3 = params3.concat(nameWinner.replaceAll(" ", "%20"));
        String params4 = "team2=";
        params4 = params4.concat(nameWinner.replaceAll(" ", "%20"));
        String params5 ="competition=";
        params5 = params5.concat(competition);
        String baseUrl2 = "https://jsonmock.hackerrank.com/api/football_matches?"+params5+"&"+param2+"&"+params3+"&page=";
        urlUrl = buildUrl(baseUrl2, page);
        con = buildConnection(urlUrl);
        Response response = new Response();
        response = gson.fromJson(getResponse(con), Response.class);
        for (Response.Data data: response.data) {
            totalGoals+=Integer.parseInt(data.team1goals);
        }
        for (int i = 2; i <= response.total_pages; i++) {
            con = buildConnection(buildUrl(baseUrl2, String.valueOf(i)));
            response = gson.fromJson(getResponse(con), Response.class);
            for (Response.Data data : response.data) {
                totalGoals+=Integer.parseInt(data.team1goals);
            }
        }
        
        baseUrl2 = "https://jsonmock.hackerrank.com/api/football_matches?"+params5+"&"+param2+"&"+params4+"&page=";
        urlUrl = buildUrl(baseUrl2, page);
        con = buildConnection(urlUrl);
        response = gson.fromJson(getResponse(con), Response.class);
        for (Response.Data data: response.data) {
            totalGoals+=Integer.parseInt(data.team2goals);
        }
        for (int i = 2; i <= response.total_pages; i++) {
            con = buildConnection(buildUrl(baseUrl2, String.valueOf(i)));
            response = gson.fromJson(getResponse(con), Response.class);
            for (Response.Data data : response.data) {
                totalGoals+=Integer.parseInt(data.team2goals);
            }
        }
        return totalGoals;
    }
    public int testCallApi1(String team, int year) throws Exception {
        team = team.replaceAll(" ", "%20");
        Gson gson = new Gson();
        String page = "1";
        String param1 = "team1=";
        String param2="year=";
        param1 = param1.concat(team);
        param2=param2.concat(String.valueOf(year));
        String baseUrl = "https://jsonmock.hackerrank.com/api/football_matches?"+param1+"&"+param2+"&page=";
        
        URL urlUrl = buildUrl(baseUrl, page);
        HttpURLConnection con = buildConnection(urlUrl);
        int totalGoals = 0;
        Response response = new Response();
        response = gson.fromJson(getResponse(con), Response.class);
        for (Response.Data data: response.data) {
            totalGoals+=Integer.parseInt(data.team1goals);
        }
        for (int i = 2; i <= response.total_pages; i++) {
            con = buildConnection(buildUrl(baseUrl, String.valueOf(i)));
            response = gson.fromJson(getResponse(con), Response.class);
            for (Response.Data data : response.data) {
                totalGoals+=Integer.parseInt(data.team1goals);
            }
        }
        con.disconnect();
        return totalGoals;
    }
    public int testCallApi2(int year) throws Exception {
        Gson gson = new Gson();
        String page = "1";
        String param = "year=";
        param = param.concat(String.valueOf(year));
        String baseUrl = "https://jsonmock.hackerrank.com/api/football_matches?"+"&"+param+"&page=";
        URL urlUrl = buildUrl(baseUrl, page);
        HttpURLConnection con = buildConnection(urlUrl);
        int numDraws = 0;
        Response response = new Response();
        response = gson.fromJson(getResponse(con), Response.class);
        for (Response.Data data: response.data) {
            if (data.team1goals.equals(data.team2goals)) {
                numDraws++;
            }
        }
        for (int i = 2; i <= response.total_pages; i++) {
            con = buildConnection(buildUrl(baseUrl, String.valueOf(i)));
            response = gson.fromJson(getResponse(con), Response.class);
            for (Response.Data data : response.data) {
                if (data.team1goals.equals(data.team2goals)) {
                    numDraws++;
                }
            }
        }
        con.disconnect();
        return numDraws;
    }
    private URL buildUrl(String url, String page) throws Exception {
        String newUrl = url;
        newUrl = newUrl.concat(page);
        URL urlUrl = new URL(newUrl);
        return urlUrl;
    }
    private HttpURLConnection buildConnection(URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        return con;
    }
    
    private String getResponse(HttpURLConnection con) throws IOException {
        String readLine;
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        StringBuffer content = new StringBuffer();
        content = new StringBuffer();
        while ((readLine = in.readLine()) != null) {
            content.append(readLine);
        }
        return content.toString();
    }
    
    public class Response2 {
        private List<Response2.Data2> data = new ArrayList<>();
    
        public List<Data2> getData() {
            return data;
        }
    
        public void setData(List<Data2> data) {
            this.data = data;
        }
    
        public class Data2 {
            private String winner;
            
            public String getWinner() {
                return winner;
            }
            
            public void setWinner(String winner) {
                this.winner = winner;
            }
        }
    }
    public class Response {
        private int page;
        private int per_page;
        private int total;
        private int total_pages;
        private List<Data> data = new ArrayList<>();
    
        public int getPage() {
            return page;
        }
    
        public void setPage(int page) {
            this.page = page;
        }
    
        public int getPer_page() {
            return per_page;
        }
    
        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }
    
        public int getTotal() {
            return total;
        }
    
        public void setTotal(int total) {
            this.total = total;
        }
    
        public int getTotal_pages() {
            return total_pages;
        }
    
        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }
    
        public List<Data> getData() {
            return data;
        }
    
        public void setData(List<Data> data) {
            this.data = data;
        }
    
        public class Data {
            private String team1goals;
            private String team2goals;
    
            public String getTeam1goals() {
                return team1goals;
            }
    
            public void setTeam1goals(String team1goals) {
                this.team1goals = team1goals;
            }
    
            public String getTeam2goals() {
                return team2goals;
            }
    
            public void setTeam2goals(String team2goals) {
                this.team2goals = team2goals;
            }
        }
    }
}
