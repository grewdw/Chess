/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidgrew.Chess;

/**
 *
 * @author David
 */
public class ChessPiece {
    String chessPieceType;
    String shortName;
    String colour;

    public Boolean isMoveValid(ChessBoard board, Movement movement) {
        return true;
    }

    public String getChessPieceType() {
        return this.chessPieceType;
    }
    
    public String getChessPieceColour() {
        return this.colour;
    }
}

