package com.ruinscraft.panilla.craftbukkit.v1_8_R3.nbt;

import com.ruinscraft.panilla.api.nbt.INbtTagCompound;
import com.ruinscraft.panilla.api.nbt.INbtTagList;
import net.minecraft.server.v1_8_R3.NBTTagList;

public class NbtTagList implements INbtTagList {

    private final NBTTagList handle;

    public NbtTagList(NBTTagList handle) {
        this.handle = handle;
    }

    @Override
    public INbtTagCompound getCompound(int index) {
        return new NbtTagCompound(handle.get(index));
    }

    @Override
    public String getString(int index) {
        return handle.getString(index);
    }

    @Override
    public int size() {
        return handle.size();
    }

}
