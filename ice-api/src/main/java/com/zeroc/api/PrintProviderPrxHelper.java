// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `Demo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.zeroc.api;

/**
 * Provides type-specific helper functions.
 **/
public final class PrintProviderPrxHelper extends Ice.ObjectPrxHelperBase implements PrintProviderPrx
{
    private static final String __print_name = "print";

    public String print(boolean parBool, String parStr)
    {
        return print(parBool, parStr, null, false);
    }

    public String print(boolean parBool, String parStr, java.util.Map<String, String> __ctx)
    {
        return print(parBool, parStr, __ctx, true);
    }

    private String print(boolean parBool, String parStr, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__print_name);
        return end_print(begin_print(parBool, parStr, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr)
    {
        return begin_print(parBool, parStr, null, false, false, null);
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr, java.util.Map<String, String> __ctx)
    {
        return begin_print(parBool, parStr, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr, Ice.Callback __cb)
    {
        return begin_print(parBool, parStr, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_print(parBool, parStr, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr, Callback_PrintProvider_print __cb)
    {
        return begin_print(parBool, parStr, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_print(boolean parBool, String parStr, java.util.Map<String, String> __ctx, Callback_PrintProvider_print __cb)
    {
        return begin_print(parBool, parStr, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_print(boolean parBool, 
                                       String parStr, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_print(parBool, parStr, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_print(boolean parBool, 
                                       String parStr, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_print(parBool, parStr, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_print(boolean parBool, 
                                       String parStr, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_print(parBool, parStr, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_print(boolean parBool, 
                                       String parStr, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_print(parBool, parStr, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_print(boolean parBool, 
                                        String parStr, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_print(parBool, parStr, __ctx, __explicitCtx, __synchronous, 
                           new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                               {
                                   public final void __completed(Ice.AsyncResult __result)
                                   {
                                       PrintProviderPrxHelper.__print_completed(this, __result);
                                   }
                               });
    }

    private Ice.AsyncResult begin_print(boolean parBool, 
                                        String parStr, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__print_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__print_name, __cb);
        try
        {
            __result.prepare(__print_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeBool(parBool);
            __os.writeString(parStr);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_print(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __print_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __print_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        com.zeroc.api.PrintProviderPrx __proxy = (com.zeroc.api.PrintProviderPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_print(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PrintProviderPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PrintProviderPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PrintProviderPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PrintProviderPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static PrintProviderPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static PrintProviderPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, PrintProviderPrx.class, PrintProviderPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::com::zeroc::api::PrintProvider"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, PrintProviderPrx v)
    {
        __os.writeProxy(v);
    }

    public static PrintProviderPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PrintProviderPrxHelper result = new PrintProviderPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
