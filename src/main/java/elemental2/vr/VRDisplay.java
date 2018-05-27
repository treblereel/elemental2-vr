/*
 *       Copyright 2018 Dmitrii Tikhomirov
 *
 *        Licensed under the Apache License, Version 2.0 (the "License");
 *        you may not use this file except in compliance with the License.
 *        You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *        Unless required by applicable law or agreed to in writing, software
 *        distributed under the License is distributed on an "AS IS" BASIS,
 *        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *        See the License for the specific language governing permissions and
 *        limitations under the License.
 */
package elemental2.vr;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VRDisplay interface of the WebVR API represents any VR device supported by this API. It includes generic
 * information such as device IDs and descriptions, as well as methods for starting to present a VR scene,
 * retrieving eye parameters and display capabilities, and other important functionality.
 * <p>
 * An array of all connected VR Devices can be returned by invoking the Navigator.getVRDisplays() method.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRDisplay implements EventTarget {

    /**
     * Returns a VRDisplayCapabilities object that indicates the various capabilities of the VRDisplay.
     *
     * @return A VRDisplayCapabilities object.
     */
    @JsProperty(name = "capabilities")
    public native VRDisplayCapabilities getCapabilities();

    /**
     * The depthFar property of the VRDisplay interface gets and sets the z-depth defining the far plane of the eye view
     * frustum, i.e. the furthest viewable boundary of the scene.
     *
     * @return depthFar, a double, representing the z-depth in meters; its initial value is 10000.0.
     */
    @JsProperty(name = "depthFar")
    public native double getDepthFar();

    /**
     * The depthNear property of the VRDisplay interface gets and sets the z-depth defining the near plane of the eye view
     * frustum, i.e. the nearest viewable boundary of the scene.
     *
     * @return depthNear, a double, representing the z-depth in meters; its initial value is 0.01.
     */
    @JsProperty(name = "depthNear")
    public native double getDepthNear();


    /**
     * The displayId read-only property of the VRDisplay interface returns an identifier for this particular VRDisplay, which is also used as an association point in the Gamepad API (see Gamepad.displayId).
     *
     * @return A number representing the ID of the specific VRDisplay.
     */
    @JsProperty(name = "displayId")
    public native int getDisplayId();


    /**
     * The displayName read-only property of the VRDisplay interface returns a human-readable name to identify the VRDisplay.
     * <p>
     * This will generally be something like "Oculus VR HMD (HMD)" or "Oculus VR HMD (Sensor)".
     *
     * @return A String containing the human-readable name of the specific VR display.
     */
    @JsProperty(name = "displayName")
    public native String getDisplayName();

    /**
     * The isConnected read-only property of the VRDisplay interface returns a Boolean indicating whether the VRDisplay is connected to the computer.
     *
     * @return A Boolean; true means the display is connected; false means it isn't.
     */
    @JsProperty(name = "isConnected")
    public native boolean isConnected();

    /**
     * Returns a Boolean indicating whether the VRDisplay is currently having content presented through it.
     *
     * @return A Boolean; true means the display is connected; false means it isn't.
     */
    @JsProperty(name = "isPresenting")
    public native boolean isPresenting();

    /**
     * The stageParameters read-only property of the VRDisplay interface returns a VRStageParameters object containing room-scale parameters, if the VRDisplay is capable of supporting room-scale experiences.
     *
     * @return VRStageParameters object containing the VRDisplay's room-scale parameters, or null if the VRDisplay is not capable of supporting room-scale experiences.
     */
    @JsProperty(name = "stageParameters")
    public native VRStageParameters getStageParameters();

    /**
     * The getEyeParameters() method of the VRDisplay interface returns the VREyeParameters object containing the eye parameters for the specified eye.
     *
     * @param whichEye A DOMString representing the eye you want to return the eye parameters for. Available values are left and right (defined in the VREye enum).
     * @return A VREyeParameters object, or null if the VR is not able to present content (e.g. VRDisplayCapabilities.canPresent returns false).
     */
    public native VREyeParameters getEyeParameters(String whichEye);

    /**
     * The getFrameData() method of the VRDisplay interface accepts a VRFrameData object and populates it with the information required to render the current frame.
     * <p>
     * This includes the VRPose and view and projection matricies for the current frame.
     *
     * @param frameData The VRFrameData object you want to populate.
     * @return A Boolean — a value of true is returned if the VRFrameData object was successfully populated, or false if it wasn't.
     */
    public native boolean getFrameData(VRFrameData frameData);

    /**
     * The getLayers() method of the VRDisplay interface returns the layers currently being presented by the VRDisplay.
     *
     * @return If the VRDevice is presenting, this method returns an array of the VRLayerInit objects currently being presented (this will currently be one, as VRDisplayCapabilities.maxLayers is currently always 1). If the VRDevice is not presenting, this method returns an empty array.
     */
    public native VRLayerInit[] getLayers();

    /**
     * The resetPose() method of the VRDisplay interface resets the pose for the VRDisplay, treating its current VRPose.position and VRPose.orientation as the "origin/zero" values.
     * <p>
     * After resetPost() has been called, future poses returned from VRDisplay.getPose()/VRDisplay.getImmediatePose() will describe positions relative to the VRDisplay's position when resetPose() was last called and will treat the display’s yaw when resetPose() was last called as the forward orientation.
     * <p>
     * The VRDisplay's reported roll and pitch do not change when resetPose() is called as they are relative to gravity. Calling resetPose() may change the VRStageParameters.sittingToStandingTransform matrix.
     */
    @Deprecated
    public native void resetPose();

    /**
     * The cancelAnimationFrame() method of the VRDisplay interface is a special implementation of Window.cancelAnimationFrame that unregisters callbacks registered with VRDisplay.requestAnimationFrame().
     *
     * @param handler The handle returned by the VRDisplay.requestAnimationFrame() call that you want to unregister.
     */
    public native void cancelAnimationFrame(double handler);

    /**
     * The requestAnimationFrame() method of the VRDisplay interface is a special implementation of Window.requestAnimationFrame containing a callback function that will be called every time a new frame of the VRDisplay presentation is rendered:
     * <p>
     * When the VRDisplay is not presenting a scene, this is functionally equivalent to Window.requestAnimationFrame.
     * When the VRDisplay is presenting, the callback is called at its native refresh rate.
     *
     * @param callback A callback function that will be called every time a new frame of the VRDisplay presentation is rendered.
     * @return A long representing the handle of the requestAnimationFrame() call. This can then be passed to a VRDisplay.cancelAnimationFrame() call to unregister the callback.
     */
    public native double requestAnimationFrame(DomGlobal.RequestAnimationFrameCallbackFn callback);

    /**
     * The requestPresent() method of the VRDisplay interface starts the VRDisplay presenting a scene.
     *
     * @param layers An array of VRLayerInit objects representing the scene you want to present. At the moment, this can be a minimum of 0 and a maximum of 1.
     * @return A promise that resolves once the presentation has begun. there are a number of rules surrounding the promise's fulfillment or rejection:
     * <p>
     * If VRDisplayCapabilities.canPresent is false, or if the VRLayer array contains more than VRDisplayCapabilities.maxLayers layers, the promise will be rejected.
     * If the VRDisplay is already presenting when requestPresent() is called, the VRDisplay will update the VRLayer array being presented.
     * If a call to requestPresent() is rejected while the VRDisplay is already presenting it will end its presentation.
     * If requestPresent() is called outside of an engagement gesture the promise will be rejected unless the VRDisplay was already presenting. This engagement gesture is also sufficient to allow requestPointerLock() calls until presentation has ended.
     */
    public native Promise requestPresent(VRLayerInit[] layers);

    /**
     * The exitPresent() method of the VRDisplay interface stops the VRDisplay presenting a scene.
     *
     * @return A promise that resolves once the presentation has ended. If the VRDisplay is not presenting when exitPresent() is called, the promise will reject.
     */
    public native Promise exitPresent();

    /**
     * The submitFrame() method of the VRDisplay interface captures the current state of the VRLayerInit currently being presented and displays it on the VRDisplay.
     * <p>
     * The frame should subsequently be rendered using the VRPose and matrices provided by the last call to getFrameData().
     */
    public native void submitFrame();

    public native void addEventListener(
            String type, EventListener listener, EventTarget.AddEventListenerOptionsUnionType options);

    public native void addEventListener(String type, EventListener listener);

    public native boolean dispatchEvent(Event evt);

    public native void removeEventListener(
            String type, EventListener listener, EventTarget.RemoveEventListenerOptionsUnionType options);

    public native void removeEventListener(String type, EventListener listener);

}
