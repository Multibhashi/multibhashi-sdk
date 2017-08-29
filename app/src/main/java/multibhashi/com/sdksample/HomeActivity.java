package multibhashi.com.sdksample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.multibhashi.services.Multibhashi;
import com.multibhashi.services.User;

/**
 * Created by Akshay Mundotia
 * Contact: akshaycrt2k@gmail.com
 */

public class HomeActivity extends AppCompatActivity {
    Multibhashi multibhashi;
    // TODO: Replace this with the Id provided to you
    private static final String CLIENT_ID = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Set User details
        User user = new User();
        user.setUserName("Random Name XXXXXX");
        user.setUserMobile("9828679450");
        user.setUserEmail("batmanrisesagain@gmail.com");

        multibhashi = new Multibhashi.Builder(CLIENT_ID)
                .courseType(Multibhashi.CourseType.GENERAL)
                .user(user)
                .build();


        Button button = (Button) findViewById(R.id.buttonStart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multibhashi.start(HomeActivity.this);
            }
        });
    }

}
