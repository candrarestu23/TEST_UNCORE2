package com.example.candr.test_uncore2.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candr.test_uncore2.R;

public class Register extends Activity{

    LoginDataBaseAdapter loginDataBaseAdapter;
    EditText password,registerID,register_email,register_phone;
    Button register;
    TextView signIn;
   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();
        password=(EditText)findViewById(R.id.register_password);
        registerID=(EditText)findViewById(R.id.register_id);
        register_email=(EditText)findViewById(R.id.register_email);
        register_phone=(EditText) findViewById(R.id.register_phone) ;
        register = (Button)findViewById(R.id.register_button);
        signIn = (TextView)findViewById(R.id.signin);


        register.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub

                String Pass=password.getText().toString();
                String id=registerID.getText().toString();
                String email = register_email.getText().toString();
                String phone = register_phone.getText().toString();
                if(Pass.equals("")||id.equals("")||email.equals("")||phone.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Fill All Fields", Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
// Save the Data in Database
                    loginDataBaseAdapter.insertEntry(id,Pass,email,phone);

// reg_btn.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                    Log.d("PASSWORD",Pass);
                    Log.d("USERNAME",id);
                    Intent intent=new Intent(Register.this,Login.class);
                    startActivity(intent);
                }
            }
        });
        signIn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
    }
}