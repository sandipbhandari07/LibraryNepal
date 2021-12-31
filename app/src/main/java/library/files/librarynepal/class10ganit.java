package library.files.librarynepal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import library.files.librarynepal.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class class10ganit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10ganit);

        PDFView pdfView = findViewById(R.id.class10ganitpdfView);
        pdfView.fromAsset("class10ganit.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}