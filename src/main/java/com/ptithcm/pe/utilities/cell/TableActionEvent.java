/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities.cell;

/**
 *
 * @author tezca
 */
public interface TableActionEvent {
    public void onEdit(int row);
    public void onDelete(int row);
}
