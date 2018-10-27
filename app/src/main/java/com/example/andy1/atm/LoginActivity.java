package com.example.andy1.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v){
        EditText edUserid=findViewById(R.id.ed_userid);
        EditText edPassword=findViewById(R.id.ed_password);
        String uid =edUserid.getText().toString();
        String pw =edPassword.getText().toString();
        if (uid.equals("jack")&&pw.equals("1234")){//login ok
            Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            getIntent().putExtra("LOGIN_USERID",uid);
            getIntent().putExtra("LOGIN_PASSWD",pw);
            setResult(RESULT_OK,getIntent());

            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("ATM")
                    .setMessage("登入失敗")
                    .setPositiveButton("ok",null)
                    .show();
        }

    }
    public void cancel(View v){

    }
}