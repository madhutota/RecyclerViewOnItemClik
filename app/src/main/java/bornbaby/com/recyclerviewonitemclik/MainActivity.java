package bornbaby.com.recyclerviewonitemclik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnItemClickListner {
  /*  @BindView(R.id.recycler_view)
    RecyclerView recycler_view;*/

    MoviesAdapter moviesAdapter;

    RecyclerView recycler_view;
    int []imagesArray= new int[] {
            R.drawable.battels,
            R.drawable.cat,
            R.drawable.eye,
            R.drawable.horrorthree,
            R.drawable.horrortwo,
            R.drawable.lions,
            R.drawable.nyce,
            R.drawable.red,
            R.drawable.triangel,
            R.drawable.stylesgun,
            R.drawable.waterball
    };

/*
    static {
        int []imagesArray= new int[] {
                R.drawable.battels,
                R.drawable.cat,
                R.drawable.eye,
                R.drawable.horrorthree,
                R.drawable.horrortwo,
                R.drawable.lions,
                R.drawable.nyce,
                R.drawable.red,
                R.drawable.triangel,
                R.drawable.stylesgun,
                R.drawable.waterball
        };

    }*/

    private ArrayList<MoviesModel> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        inItUi();

    }


    private void inItUi() {
        recycler_view = findViewById(R.id.recycler_view);
        prepareMoviesModelData();






        moviesAdapter = new MoviesAdapter(this, moviesList);
        //  MoviesModelsAdapter.setOnItemClickListner(this);
       /* RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(moviesAdapter);*/


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_view.setLayoutManager(mLayoutManager);
        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view.setAdapter(moviesAdapter);

        moviesAdapter.setOnItemClickListner(this);





    }

    private void prepareMoviesModelData() {
        moviesList = new ArrayList<>();
        MoviesModel MoviesModel = new MoviesModel("Mad Max: Fury Road", "Action & Adventure", "2015",imagesArray[0]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Inside Out", "Animation, Kids & Family", "2015",imagesArray[1]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015",imagesArray[1]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Shaun the Sheep", "Animation", "2015",imagesArray[2]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("The Martian", "Science Fiction & Fantasy", "2015",imagesArray[3]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Mission: Impossible Rogue Nation", "Action", "2015",imagesArray[4]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Up", "Animation", "2009",imagesArray[5]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Star Trek", "Science Fiction", "2009",imagesArray[6]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("The LEGO MoviesModel", "Animation", "2014",imagesArray[7]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Iron Man", "Action & Adventure", "2008",imagesArray[8]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Aliens", "Science Fiction", "1986",imagesArray[9]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Chicken Run", "Animation", "2000",imagesArray[7]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Back to the Future", "Science Fiction", "1985",imagesArray[1]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Raiders of the Lost Ark", "Action & Adventure", "1981",imagesArray[10]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Goldfinger", "Action & Adventure", "1965",imagesArray[5]);
        moviesList.add(MoviesModel);

        MoviesModel = new MoviesModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014",imagesArray[1]);
        moviesList.add(MoviesModel);

    }




    /*public ArrayList<MoviesModelsModel> getMoviesModelsList() {

        *//*
        *   R.drawable.battels,
                R.drawable.cat,
                R.drawable.eye,
                R.drawable.horrorthree,
                R.drawable.horrortwo,
                R.drawable.lions,
                R.drawable.nyce,
                R.drawable.red,
                R.drawable.triangel,
                R.drawable.stylesgun,
                R.drawable.waterball*//*
        moviesList = new ArrayList<>();
        MoviesModelsList.add(new MoviesModelsModel("Battels", "battels", imagesArray[0]));
        MoviesModelsList.add(new MoviesModelsModel("Cat", "cat", imagesArray[1]));
        MoviesModelsList.add(new MoviesModelsModel("Eye", "eye", imagesArray[2]));
        MoviesModelsList.add(new MoviesModelsModel("Horror", "horror", imagesArray[3]));
        MoviesModelsList.add(new MoviesModelsModel("Lion", "lion", imagesArray[4]));
        MoviesModelsList.add(new MoviesModelsModel("Nyce", "nyc", imagesArray[5]));
        MoviesModelsList.add(new MoviesModelsModel("Red", "red", imagesArray[6]));
        MoviesModelsList.add(new MoviesModelsModel("Triangel", "trangel", imagesArray[7]));
        MoviesModelsList.add(new MoviesModelsModel("Battels", "battels", imagesArray[8]));

        return MoviesModelsList;
    }*/

    @Override
    public void Click(int position, View view) {

        Toast.makeText(this, "Clicked on Item", Toast.LENGTH_SHORT).show();


    }
}
