import angr

def main():
    project = angr.Project('./masterpiece', main_opts={'entry_point': 0x8049000, 'arch': 'i386'})

    #Start in main()
    initial_state = project.factory.entry_state()

    #Start simulation
    simulation = project.factory.simgr(initial_state)

    #Find the way yo reach the good address
    good_address = 0x8049040

    #Avoiding this address
    avoid_address = 0x8049056

    simulation.explore(find=good_address, avoid=avoid_address)

    return simulation.found

if __name__ == '__main__':
    print(main())