package TemplateMethod;

public abstract class ATMTemplateParameters {
        public void addParamQoS(){
            System.out.println("Added Parameters for Quality of Service");
        }

        public void addParamUsage(){
            System.out.println("Added Usage Parameters");
        }

        public void addServiceCategories(){
            System.out.println("Added Service Categories");
        }

        public abstract boolean addParamCTD();
        public abstract boolean addParamPCR();
        public abstract boolean addBT();
        public abstract boolean addCLR();

        public void build(){
            addParamQoS();
            addParamUsage();
            addServiceCategories();

            if(addParamCTD()){
                System.out.println("Added Cell Transfer Delay");
            }
            if(addParamPCR()){
                System.out.println("Added Peak Cell Rate");
            }
            else
            {
                System.out.println("No Usage Usage Parameters Peak Cell Rat");
            }
            if (addBT()){
                System.out.println("Added Burst Tolerance");
            }
            if (addCLR()){
                System.out.println("Added Cell Loss Ratio ");
            }
        }
    }
