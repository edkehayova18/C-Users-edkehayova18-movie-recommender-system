package com.example.movierecommendersystem;

import lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] result = recommender.recommendMovies("finding Dory");
        System.out.println(Arrays.toString(result));
    }

}
