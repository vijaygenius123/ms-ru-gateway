package com.vijaygenius123.randomuser.msrugateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RandomUserResponseV1 {
    public ArrayList<Result> results;
    public Info info;
}
