/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.zyre;
import org.zeromq.zyre.Zhash;
import org.zeromq.zyre.Zlist;
import org.zeromq.zyre.Zmsg;
import org.zeromq.zyre.Zsock;

public class ZyreEvent {
    public native void create ();
    public native void destroy ();
    public native void print ();
    public native String sender ();
    public native String name ();
    public native String address ();
    public native Zhash headers ();
    public native String header (String Name);
    public native String group ();
    public native Zmsg msg ();
    public native void test (boolean Verbose);
}
/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
