package ru.mirea.bryazgin.mireaproject.ui.browser;

import androidx.lifecycle.ViewModelProvider;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import ru.mirea.bryazgin.mireaproject.R;
import ru.mirea.bryazgin.mireaproject.WebViewFragment;
import ru.mirea.bryazgin.mireaproject.databinding.FragmentBrowserBinding;


public class BrowserFragment extends Fragment {

    private FragmentBrowserBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BrowserViewModel browserViewModel =
                new ViewModelProvider(this).get(BrowserViewModel.class);

        binding = FragmentBrowserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBrowser;
        browserViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        WebView webView = root.findViewById(R.id.ya_view);
        webView.loadUrl("https://google.com/");
        webView.setWebViewClient(new WebViewFragment());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}