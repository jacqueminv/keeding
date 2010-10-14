package controllers;

import play.mvc.Controller;
import play.mvc.With;
import play.data.validation.Required;

import models.*;

@With(Secure.class)
public class Sources extends Controller {

    public static void add(@Required String url) {

    }
    
}