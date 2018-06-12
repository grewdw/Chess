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
public class Piece {
    String chessPieceType;
    String shortName;
    String uniqueName;
    String colour;
    ChessBoardSquare currentSquare;
    
    public void addUniqueName(String shortName, String currentSquare) {
        this.uniqueName = shortName + currentSquare;
    }

    public Boolean isMoveValid(ChessBoard board, Movement movement) {
        return true;
    }

    public String getChessPieceType() {
        return this.chessPieceType;
    }
    
    public String getChessPieceColour() {
        return this.colour;
    }
    
    public ChessBoardSquare getCurrentSquare() {
        return this.currentSquare;
    }
    
    public void updateCurrentSquare(ChessBoardSquare newSquare) {
        this.currentSquare = newSquare;
    }
    
    public String getShortName() {
        return this.shortName;
    }
    
    public String getUniqueName() {
        return this.uniqueName;
    }
}

