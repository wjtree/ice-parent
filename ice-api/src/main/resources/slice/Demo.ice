// ICE 数据类型支持：bool，byte，short，int，long，float，double，string
#ifndef Demo_ICE
#define Demo_ICE

module com {
    module zeroc {
        module api {
            interface DemoProvider {
                string sayHelo(int parInt, string parStr);
            };
            interface PrintProvider {
                string print(bool parBool, string parStr);
            };
        };
    };
};

#endif