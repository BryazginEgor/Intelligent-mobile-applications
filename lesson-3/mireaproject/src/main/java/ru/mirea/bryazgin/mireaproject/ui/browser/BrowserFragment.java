package ru.mirea.bryazgin.mireaproject.ui.browser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.mirea.bryazgin.mireaproject.R;
import ru.mirea.bryazgin.mireaproject.WebViewFragment;
import ru.mirea.bryazgin.mireaproject.databinding.FragmentBrowserBinding;



public class BrowserFragment extends Fragment {

    private BrowserViewModel browserViewModel;
    private FragmentBrowserBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BrowserViewModel browserViewModel =
                new ViewModelProvider(this).get(BrowserViewModel.class);
        binding = FragmentBrowserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        WebView webView = root.findViewById(R.id.yandex_view);

        webView.loadUrl("https://ya.ru/");
        webView.setWebViewClient(new WebViewFragment());

        final TextView textView = binding.textBrowser;
        browserViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}