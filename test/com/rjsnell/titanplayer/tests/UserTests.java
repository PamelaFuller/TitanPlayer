/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rjsnell.titanplayer.tests;

import com.rjsnell.titanplayer.bll.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rich
 */
public class UserTests {
    
    public UserTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNewUser() {
        User a = new User("Ernie", "rubb3rDuck!e", "ernie@sesamestreet.com");
        assertEquals("Ernie", a.getUsername());
        User b = new User("Burt", "ilovepyj@mas", "burt@semamestreet.com");
        assertEquals(null, b.getUsername());
        User c = new User("The Count", "!love2count", "ahhh@ahhhahhh.ahhhhhhh");
        assertEquals(null, c.getUsername());
        User d = new User("Sam the Man", "manwh0can", "tanvan.sesamiestreet.com");
        assertEquals(null, d.getUsername());
       
    }
}