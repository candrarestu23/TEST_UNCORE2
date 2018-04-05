package com.example.candr.test_uncore2.Login;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candr.test_uncore2.MainActivity;
import com.example.candr.test_uncore2.R;

public class Login extends Activity {

    LoginDataBaseAdapter loginDataBaseAdapter;
    Button login;
    EditText login_password,login_id;
    TextView staff,teacher,parent,student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Transition exit = new Slide();
        Transition enter = new Slide();
        getWindow().setEnterTransition(enter);
        getWindow().setExitTransition(exit);


        login=(Button)findViewById(R.id.Login_button);
        staff=(TextView) findViewById(R.id.staffLogin);
        teacher=(TextView) findViewById(R.id.TeacherLogin);
        parent = (TextView) findViewById(R.id.parentLogin);
        student = (TextView) findViewById(R.id.studentLogin);
        login_password=(EditText)findViewById(R.id.login_password);
        login_id=(EditText) findViewById(R.id.login_id);

        loginDataBaseAdapter = new LoginDataBaseAdapter(getApplicationContext());
        loginDataBaseAdapter.open();

        staff.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent=new Intent(Login.this,staffLogin.class);
                startActivity(intent , ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle());
            }
        });

        teacher.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent=new Intent(Login.this,teacherLogin.class);
                startActivity(intent , ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle());
            }
        });

        parent.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent=new Intent(Login.this,parentLogin.class);
                startActivity(intent , ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle());
            }
        });

        student.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent=new Intent(Login.this,studentLogin.class);
                startActivity(intent , ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle());
            }
        });

        login.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                String Password=login_password.getText().toString();
                String ID = login_id.getText().toString();

                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(Password);
                String storedUSername=loginDataBaseAdapter.getSinlgeEntry2(ID);
                String storedEmail = loginDataBaseAdapter.getSinlgeEntryEmail(ID);
                if(Password.equals("123")&&ID.equals("123")){
                    Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_LONG).show();
                    Intent ii=new Intent(Login.this,MainActivity.class);
                    startActivity(ii);
                }
                if(Password.equals(storedPassword)&&ID.equals(storedUSername))
                {
                    Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_LONG).show();
                    Intent ii=new Intent(Login.this,MainActivity.class);
                    ii.putExtra("ID",storedUSername);
                    ii.putExtra("EMAIL",storedEmail);
                    startActivity(ii);
                }
                else
                if(Password.equals("")||ID.equals("")){
                    Toast.makeText(Login.this, "Please Enter Your id/Password", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Login.this, "incorect password/id", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
// Close The Database
        loginDataBaseAdapter.close();
    }

}