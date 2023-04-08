package ru.mirea.bryazgin.mireaproject.ui.cat;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.mirea.bryazgin.mireaproject.R;
import ru.mirea.bryazgin.mireaproject.databinding.FragmentCatBinding;



public class CatFragment extends Fragment {

    private FragmentCatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CatViewModel catViewModel =
                new ViewModelProvider(this).get(CatViewModel.class);

        binding = FragmentCatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCat;
        textView.setText("С точки зрения научной систематики, домашняя кошка — млекопитающее семейства кошачьих отряда хищных. Одни исследователи рассматривают домашнюю кошку как подвид дикой кошки, другие — как отдельный биологический вид.\n" +
                "\n");
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}