package com.ecom.WooW.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ecom.WooW.R;
import com.google.android.material.textfield.TextInputEditText;


public class OtpActivity extends AppCompatActivity {

//    FirebaseAuth mAuth;
//    FirebaseUser CurrentUser;
    String mAuthCredentials;
    TextInputEditText Otp;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
//        CurrentUser=mAuth.getCurrentUser();
//        mAuth=FirebaseAuth.getInstance();
        Otp=findViewById(R.id.Otp);
        login=findViewById(R.id.login);
        mAuthCredentials=getIntent().getStringExtra("AuthCredentials");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otp=Otp.getText().toString();
//                PhoneAuthCredential credential= PhoneAuthProvider.getCredential(mAuthCredentials,otp);
//                signInWithPhone(credential);
                if(otp.equals("1234")){
                    Intent intent=new Intent(OtpActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(OtpActivity.this,"Wrong otp",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
//    private void signInWithPhone(PhoneAuthCredential phoneAuthCredential){
//        mAuth.signInWithCredential(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if(task.isSuccessful()){
//                    Intent intent=new Intent(OtpActivity.this,MainActivity.class);
//                    startActivity(intent);
//                }
//                else {
//                    if(task.getException() instanceof FirebaseAuthInvalidCredentialsException){
//                        Toast.makeText(OtpActivity.this,"Error in Otp verification",Toast.LENGTH_LONG).show();
//                    }
//
//                }
//            }
//        });
//    }
}