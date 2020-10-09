package com.example.project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    private int pageNumber;

    private String[] engSubs = new String[]{"I am Not singing this", "What's not to like?" , "You are a female and you are a teenager",
                                    "This song was made for you", "Wow! it's like you can see inside mu tiny teenage mind",
                                    "I know, right?", "You just got add some moves and a little bit of...",
                                    "Hey, i just met you, and this is crazy, but here's my number, so call me maybe", "Go for it",
                                    "Oh, you mean like this?", "Try to chase me, but here's my number, so call me maybe",
                                    "There you go, You're a natural!"};

    String[] ruSubs = new String[]{"Я не буду это петь","Почему тебе не нравится?","Ты же девушка и ты подросток.","Песня идеально тебе подходит.",
                                    "Вау, ты словно видишь мой крошечный ум подростка на сквозь!","Я знаю, правда?",
                                    "Тебе просто нужно добавить немного движений и чуть-чуть...",
                                    "Эй я только что встретила тебя. И это просто сумашествие! Но вот мой номер. Позвонишь, может быть?",
                                    "Попробуй!","Оу, ты имеешь ввиду вот так?","...ухлестывают за мной. Но вот мой номер. Позвонишь, может быть?",
                                    "Да, вот так! У тебя талант от природы!"};

    public int subsLength(){
        return engSubs.length;
    }
    public static PageFragment newInstance(int page){
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View result = inflater.inflate(R.layout.fragment_page, container, false);
        TextView pageHeader = (TextView)result.findViewById(R.id.displayList);
        TextView pageHeader2 = (TextView)result.findViewById(R.id.displayList2);
        String header;
        String header2;
            header = engSubs[pageNumber];
            pageHeader.setText(header);
            header2 = ruSubs[pageNumber];
            pageHeader2.setText(header2);


        return result;
    }

}
