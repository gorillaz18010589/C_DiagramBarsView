package android.rockchip.c_diagrambarsview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private DiagramBarsView diagramBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initDiagramBarView();
    }

    private void initDiagramBarView() {
        diagramBarView.setBarCount(20);
        diagramBarView.setBarColor(1, 20, R.color.design_default_color_error);
        diagramBarView.setBarMaxLevel(20);

        int[] bars = new int[20];

        for (int i = 0; i < 20; i++) {
            int rad = (int) (Math.random() * 20);
            bars[i] = rad;
            Log.v("hank", "陣列給直rad:" + rad);
        }

        for (int i = 0; i < bars.length; i++) {
            diagramBarView.setBarLevel(1, i, bars[i]);
            Log.v("hank", "bar:" + bars[i]);
        }

    }

    private void initView() {
        diagramBarView = findViewById(R.id.diagramBarView);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        WindowUtils.closeStatusBar(getWindow());
    }
}