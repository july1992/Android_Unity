# Android_Unity
Android 嵌入到  Unity  中


# unity 代码
```
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        Invoke("TestAndroid", 5);

    }
    void TestAndroid()
    {
        Debug.Log("TestAndroid start----------");
       
        AndroidJavaClass uCls = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
        AndroidJavaObject uActivity = uCls.GetStatic<AndroidJavaObject>("currentActivity");
        //var spActivity = new AndroidJavaClass("com.senseplay.sdk.tool.SPActivity");
        //AndroidJavaObject uContext = spActivity.CallStatic<AndroidJavaObject>("getContent", uActivity);

        //AndroidJavaClass jar = new AndroidJavaClass("com.senseplay.ssp.SspManager");
        AndroidJavaClass jar = new AndroidJavaClass("com.vily.asdadadsasd.SspManager");
        AndroidJavaObject instance = jar.CallStatic<AndroidJavaObject>("getInstance", uActivity);
        instance.Call("toMain");

        Debug.Log("TestAndroid end---------------:        ");
    }
    // Update is called once per frame
    void Update()
    {
        
    }
}

```