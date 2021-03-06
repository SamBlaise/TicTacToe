package com.samblaise.tictactoe.Classes;

import com.samblaise.tictactoe.utils.JSONSerialisable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

/**
 * Project : TicTacToe
 * com.samblaise.tictactoe.models
 * Created by sam on 29/05/16.
 *
 * Class who represent a move on the tictactoe
 */

public class Move extends JSONSerialisable {
    private final int x,y;
    private final String playerId;

    /**
     * Constructor
     * @param x cord x
     * @param y cord y
     */
    public Move(int x, int y,String playerId) {
        this.x = x;
        this.y = y;
        this.playerId = playerId;
    }

    @Override
    public String toJSONString() {
        String res="";
        try {
            res = new JSONObject().put("player", playerId).put("x",x).put("y",y).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public Map<String, String> getParams() {
        return null;
    }

    @Override
    public ArrayList<String> getJSONNames() {
        return null;
    }

    public String getPlayerId() {
        return playerId;
    }
}
