import { AppRegistry } from 'react-native';
import App from './App';
import { Navigation } from 'react-native-navigation';
Navigation.registerComponent('WelcomeScreen', () => App);

Navigation.events().onAppLaunched(() => {
  Navigation.setRoot({
    bottomTabs: {
      children: [
        {
          stack: {
            children: [
              {
                component: {
                  name: 'WelcomeScreen',
                  passProps: {
                    text: 'This is tab 1',
                    myFunction: () => 'Hello from a function!',
                  },
                  options: {
                    topBar: {
                      visible: true,
                      title: {
                        text: 'React Native Navigation!',
                      },
                    },
                  },
                },
              },
            ],
            options: {
              bottomTab: {
                title: 'Tab 1',
              },
              topBar: {
                visible: false,
              },
            },
          },
        },
        {
          stack: {
            children: [
              {
                externalComponent: {
                  name: 'RNNCustomComponent',
                  passProps: {
                    text: 'External component in stack',
                  },
                },
              },
            ],
            options: {
              bottomTab: {
                title: 'Tab 2',
              },
              topBar: {
                visible: false,
              },
            },
          },
        },
      ],
    },
    options: {
      bottomTabs: {
        tabColor: 'red',
        selectedTabColor: 'blue',
        fontFamily: 'HelveticaNeue-Italic',
        fontSize: 13,
      },
    },
  });
});
