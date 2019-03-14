package movie.bw.com.weiduyingyuan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QiDongActivity extends AppCompatActivity {

    @BindView(R.id.qi_dong)
    TextView qiDong;
    int time=3;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0)
            {
                if(time>1)
                {
                    time--;
                    qiDong.setText(time+"s");
                    handler.sendEmptyMessageDelayed(0,1000);
                }else
                {
                    Intent intent = new Intent(QiDongActivity.this, YinDaoActivity.class);
                    startActivity(intent);
                }
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qi_dong);
        ButterKnife.bind(this);
        handler.sendEmptyMessageDelayed(0,1000);
    }
}
