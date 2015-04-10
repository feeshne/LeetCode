import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import java.util.List;

/**
 * Created by Feeshne on 2015/4/10.
 */
public class PMTest {
    static final String URL="http://apistore.baidu.com/microservice/aqi";
    interface PM{
        @GET("/")
        List<PmBean> test(
            @Query("city") String a
        );
    }
    public static void main(String[] args) {
        RestAdapter restAdapter=new RestAdapter.Builder().setEndpoint(URL).build();
        PM pmTest=restAdapter.create(PM.class);
        List<PmBean> tmp=pmTest.test("π„÷›");
        for (PmBean contributor : tmp) {
            System.out.println(contributor.retData.city);
        }
}
}
