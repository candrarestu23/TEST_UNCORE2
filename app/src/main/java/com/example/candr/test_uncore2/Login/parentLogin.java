package com.example.candr.test_uncore2.Login;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candr.test_uncore2.R;

/**
 * Created by candr on 30/12/2016.
 */

public class parentLogin extends Activity {
    Button login;
    Context context;
    EditText login_password,login_id;
    TextView admin,teacher,student,staff;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_login);

        Transition exit = new Slide();
        Transition enter = new Slide();
        getWindow().setEnterTransition(enter);
        getWindow().setExitTransition(exit);


        login=(Button)findViewById(R.id.Login_button);
        admin=(TextView) findViewById(R.id.adminLogin);
        teacher=(TextView) findViewById(R.id.TeacherLogin);
        student = (TextView) findViewById(R.id.studentLogin);
        staff = (TextView) findViewById(R.id.staffLogin);
        login_password=(EditText)findViewById(R.id.login_password);
        login_id=(EditText) findViewById(R.id.login_id);


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parentLogin.this, Login.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(parentLogin.this).toBundle());
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parentLogin.this, teacherLogin.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(parentLogin.this).toBundle());
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parentLogin.this, studentLogin.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(parentLogin.this).toBundle());
            }
        });

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parentLogin.this, staffLogin.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(parentLogin.this).toBundle());
            }
        });
        final String Password=login_password.getText().toString();
        final String ID = login_id.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Password.equals("")||ID.equals("")){
                    Toast.makeText(parentLogin.this, "Please Enter Your id/Password", Toast.LENGTH_SHORT).show();
                }else
                Toast.makeText(context, "Incorect Id/Password" ,Toast.LENGTH_SHORT);
            }
        });
    }
}
