package gabriellee.project.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ArticleResponse {

    @SerializedName("articles")
    private ArrayList<Article> articles;

    public ArrayList<Article> getArticles() {
        return articles;
    }
}
