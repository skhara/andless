/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\dns\\IdeaProjects\\temp\\andLess\\app\\src\\main\\aidl\\net\\avs234\\IAndLessSrv.aidl
 */
package net.avs234;
public interface IAndLessSrv extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.avs234.IAndLessSrv
{
private static final java.lang.String DESCRIPTOR = "net.avs234.IAndLessSrv";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.avs234.IAndLessSrv interface,
 * generating a proxy if needed.
 */
public static net.avs234.IAndLessSrv asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.avs234.IAndLessSrv))) {
return ((net.avs234.IAndLessSrv)iin);
}
return new net.avs234.IAndLessSrv.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_init_playlist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.init_playlist(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_add_to_playlist:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _result = this.add_to_playlist(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_play:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.play(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_seek_to:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.seek_to(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_play_next:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.play_next();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_play_prev:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.play_prev();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.pause();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_resume:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.resume();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_inc_vol:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.inc_vol();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_dec_vol:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.dec_vol();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.shutdown();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_is_running:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.is_running();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_is_paused:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.is_paused();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_initialized:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.initialized();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_get_cur_mode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_cur_mode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_cur_dir:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.get_cur_dir();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_get_cur_pos:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_cur_pos();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_cur_track_source:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.get_cur_track_source();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_get_cur_seconds:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_cur_seconds();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_track_duration:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_track_duration();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_cur_track_len:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_cur_track_len();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_cur_track_start:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.get_cur_track_start();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_get_cur_track_name:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.get_cur_track_name();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_set_driver_mode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.set_driver_mode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_set_headset_mode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.set_headset_mode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
net.avs234.IAndLessSrvCallback _arg0;
_arg0 = net.avs234.IAndLessSrvCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
net.avs234.IAndLessSrvCallback _arg0;
_arg0 = net.avs234.IAndLessSrvCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_get_cue_from_flac:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.get_cue_from_flac(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_launch:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.launch(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements net.avs234.IAndLessSrv
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public boolean init_playlist(java.lang.String path, int nitems) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
_data.writeInt(nitems);
mRemote.transact(Stub.TRANSACTION_init_playlist, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean add_to_playlist(java.lang.String track_source, java.lang.String track_name, int start_time, int pos) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(track_source);
_data.writeString(track_name);
_data.writeInt(start_time);
_data.writeInt(pos);
mRemote.transact(Stub.TRANSACTION_add_to_playlist, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean play(int n, int start) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(n);
_data.writeInt(start);
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean seek_to(int p) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(p);
mRemote.transact(Stub.TRANSACTION_seek_to, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean play_next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play_next, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean play_prev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play_prev, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean resume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resume, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean inc_vol() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_inc_vol, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean dec_vol() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dec_vol, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean is_running() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_is_running, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean is_paused() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_is_paused, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean initialized() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_initialized, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_cur_mode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_mode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String get_cur_dir() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_dir, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_cur_pos() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_pos, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String get_cur_track_source() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_track_source, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_cur_seconds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_seconds, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_track_duration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_track_duration, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_cur_track_len() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_track_len, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get_cur_track_start() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_track_start, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String get_cur_track_name() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get_cur_track_name, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void set_driver_mode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_set_driver_mode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void set_headset_mode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_set_headset_mode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(net.avs234.IAndLessSrvCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(net.avs234.IAndLessSrvCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int[] get_cue_from_flac(java.lang.String file) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(file);
mRemote.transact(Stub.TRANSACTION_get_cue_from_flac, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void launch(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_launch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_init_playlist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_add_to_playlist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_seek_to = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_play_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_play_prev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_inc_vol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_dec_vol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_is_running = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_is_paused = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_initialized = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_get_cur_mode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_get_cur_dir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_get_cur_pos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_get_cur_track_source = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_get_cur_seconds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_get_track_duration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_get_cur_track_len = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_get_cur_track_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_get_cur_track_name = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_set_driver_mode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_set_headset_mode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_get_cue_from_flac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_launch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
}
public boolean init_playlist(java.lang.String path, int nitems) throws android.os.RemoteException;
public boolean add_to_playlist(java.lang.String track_source, java.lang.String track_name, int start_time, int pos) throws android.os.RemoteException;
public boolean play(int n, int start) throws android.os.RemoteException;
public boolean seek_to(int p) throws android.os.RemoteException;
public boolean play_next() throws android.os.RemoteException;
public boolean play_prev() throws android.os.RemoteException;
public boolean pause() throws android.os.RemoteException;
public boolean resume() throws android.os.RemoteException;
public boolean inc_vol() throws android.os.RemoteException;
public boolean dec_vol() throws android.os.RemoteException;
public boolean shutdown() throws android.os.RemoteException;
public boolean is_running() throws android.os.RemoteException;
public boolean is_paused() throws android.os.RemoteException;
public boolean initialized() throws android.os.RemoteException;
public int get_cur_mode() throws android.os.RemoteException;
public java.lang.String get_cur_dir() throws android.os.RemoteException;
public int get_cur_pos() throws android.os.RemoteException;
public java.lang.String get_cur_track_source() throws android.os.RemoteException;
public int get_cur_seconds() throws android.os.RemoteException;
public int get_track_duration() throws android.os.RemoteException;
public int get_cur_track_len() throws android.os.RemoteException;
public int get_cur_track_start() throws android.os.RemoteException;
public java.lang.String get_cur_track_name() throws android.os.RemoteException;
public void set_driver_mode(int mode) throws android.os.RemoteException;
public void set_headset_mode(int mode) throws android.os.RemoteException;
public void registerCallback(net.avs234.IAndLessSrvCallback cb) throws android.os.RemoteException;
public void unregisterCallback(net.avs234.IAndLessSrvCallback cb) throws android.os.RemoteException;
public int[] get_cue_from_flac(java.lang.String file) throws android.os.RemoteException;
public void launch(java.lang.String path) throws android.os.RemoteException;
}
