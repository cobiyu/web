package com.cobi.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardCommand {
    void execute(HttpServletRequest request, HttpServletResponse response);
}
