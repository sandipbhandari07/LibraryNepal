package library.files.librarynepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import library.files.librarynepal.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class class10optmath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10optmath);

        PDFView pdfView = findViewById(R.id.class10optmathpdfView);
        pdfView.fromAsset("class10optmath.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}