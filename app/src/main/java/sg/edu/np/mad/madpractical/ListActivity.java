package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";

    static ArrayList<User> userList = new ArrayList<>();

    static {
        for (int i = 0; i < 20; i++) {
            userList.add(new User(
                    "Name" + randomInt(),
                    "Description " + randomInt(),
                    i,
                    randomInt() % 2 == 1
            ));
        }
    }

    private static int randomInt() {
        return new Random().nextInt();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Log.v(TAG, "Create");

        RecyclerView recyclerView = findViewById(R.id.rv);
        UserAdapter mAdapter = new UserAdapter(userList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}