package movie.bw.com.weiduyingyuan.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import movie.bw.com.weiduyingyuan.R;
import movie.bw.com.weiduyingyuan.base.BasePresenter;
import movie.bw.com.weiduyingyuan.base.baseFragment2;

public class MovieFragment extends baseFragment2 {
    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected View initFragmentView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.movie,null,false);
    }

    @Override
    protected void initFragmentChildView(View view) {

    }

    @Override
    protected void initFragmentData(Bundle savedInstanceState) {

    }
}
